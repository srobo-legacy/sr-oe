DESCRIPTION = "Student Robotics SRIC based MSP430 flashing utility"
SRCREV = "16689ccc0bf2b98c7248ec8bbbda3698ef70364d"

PR = "r9"
PV = "git_${SRCREV}"

DEPENDS = "glib-2.0 libelf sricd"

inherit pkgconfig

SRC_URI = "git://git.srobo.org/flashb.git;protocol=git"

CFLAGS_append = " `pkg-config --cflags glib-2.0 libsric`"
LDFLAGS_append = " `pkg-config --libs glib-2.0 libsric` -lelf"

do_compile() {
	oe_runmake CFLAGS="${CFLAGS}" LDFLAGS="${LDFLAGS}" -C ${WORKDIR}/git
}

do_install() {
	oe_runmake 'DESTDIR=${D}' PREFIX=/usr -C ${WORKDIR}/git install
}
