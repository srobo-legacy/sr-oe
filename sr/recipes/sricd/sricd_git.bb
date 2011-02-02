DESCRIPTION = "SRIC controller daemon"
SRCREV = "eb44ad101588e0aa2632b001ce9969c3c4b6abf8"

PR = "r3"
PV = "git_${SRCREV}"
   
inherit pkgconfig

SRC_URI = "git://git.srobo.org/sricd.git;protocol=git"

do_compile() {
	oe_runmake HOSTCC=${BUILD_CC} -C ${WORKDIR}/git
}
