DESCRIPTION = "Python library for using i2c-dev"
SRCREV = 2834

PR = "r1"
PV = "svn_r${SRCREV}"

SRC_URI = "svn://svn.srobo.org/boards/slug/c2py;module=trunk;proto=http;rev=${SRCREV}"

DEPENDS = "python"

# necessary to get python-config to succeed:
inherit distutils-base
export BUILD_SYS
export HOST_SYS

do_compile() {
	oe_runmake -C ${WORKDIR}/trunk
}
