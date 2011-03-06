DESCRIPTION = "SR scripts for starting/stopping user code on a robot"

PR = "r0"

inherit update-rc.d

SRC_URI = "file://insert.sh \
           file://kill_robot.sh \
           file://remove.sh \
           file://robosetup \
           file://start_robot.sh \
           file://zzzrobot.rules"

do_install() {
	install -m 0755 -d ${D}/etc/robot
	install -m 0755 ${WORKDIR}/insert.sh ${D}/etc/robot
	install -m 0755 ${WORKDIR}/kill_robot.sh ${D}/etc/robot
	install -m 0755 ${WORKDIR}/remove.sh ${D}/etc/robot
	install -m 0755 ${WORKDIR}/robosetup ${D}/etc/init.d
	install -m 0755 ${WORKDIR}/start_robot.sh ${D}/etc/robot

	install -d ${D}/etc/udev/rules.d
	install ${WORKDIR}/zzzrobot.rules ${D}/etc/udev/rules.d
}

INITSCRIPT_NAME = "robosetup"
INITSCRIPT_PARAMS = "start 99 5 . stop 99 0 1 6 ."
