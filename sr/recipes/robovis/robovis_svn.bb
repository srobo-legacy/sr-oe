DESCRIPTION = "Student Robotics vision software"
SRCREV = 2841

PR = "r1"
PV = "svn_r${SRCREV}"
   
inherit pkgconfig

SRC_URI = "svn://svn.srobo.org/boards/slug/vision;module=robovis;proto=http;rev=${SRCREV}"

DEPENDS = "opencv"

do_compile() {
	oe_runmake -C ${WORKDIR}/robovis hueblobs
}
  