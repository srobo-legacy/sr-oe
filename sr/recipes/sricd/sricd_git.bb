DESCRIPTION = "SRIC controller daemon"
SRCREV = "e9a932294f27d1056e8f892444f6e9e78cb6a0e0"

PR = "r5"
PV = "git_${SRCREV}"
   
inherit pkgconfig

SRC_URI = "git://git.srobo.org/sricd.git;protocol=git"

do_compile() {
	oe_runmake HOSTCC=${BUILD_CC} PREFIX=/usr -C ${WORKDIR}/git
}

do_install() {
	oe_runmake 'DESTDIR=${D}' PREFIX=/usr -C ${WORKDIR}/git install
}
