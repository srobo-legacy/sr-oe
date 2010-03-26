DESCRIPTION = "Student Robotics vision software"
SRCREV = "765be1a6ea3730393a4550aef6e30ec3b2c3482a"

PR = "r2"
PV = "git_${SRCREV}"
   
inherit pkgconfig

SRC_URI = "git://srobo.org/robovis.git;protocol=git"

do_compile() {
	oe_runmake -C ${WORKDIR}/git hueblobs
}
