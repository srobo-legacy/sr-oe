DESCRIPTION = "SR scripts for starting/stopping user code on a robot"

PR = "r0"

SRC_URI = "file://insert.sh \
           file://kill_robot.sh \
           file://remove.sh \
           file://setup.sh \
           file://start_robot.sh"

do_install() {
	install -m 0755 -d ${D}/etc/robot
	install -m 0755 ${WORKDIR}/insert.sh ${D}/etc/robot
	install -m 0755 ${WORKDIR}/kill_robot.sh ${D}/etc/robot
	install -m 0755 ${WORKDIR}/remove.sh ${D}/etc/robot
	install -m 0755 ${WORKDIR}/setup.sh ${D}/etc/robot
	install -m 0755 ${WORKDIR}/start_robot.sh ${D}/etc/robot
}
