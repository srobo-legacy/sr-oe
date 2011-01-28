DESCRIPTION = "SRIC controller daemon"
SRCREV = "eb44ad101588e0aa2632b001ce9969c3c4b6abf8"

PR = "r2"
PV = "git_${SRCREV}"
   
inherit pkgconfig

SRC_URI = "git://git.srobo.org/sricd.git;protocol=git"

do_compile_prepend() {
	$BUILD_CC ${WORKDIR}/git/sricd/crc16/crc16-build.c -o ${WORKDIR}/git/sricd/crc16/crc16-build
}

do_compile() {
	oe_runmake -C ${WORKDIR}/git
}
