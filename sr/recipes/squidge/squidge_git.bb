DESCRIPTION = "Student Robotics GUI"
SRCREV = "41eb91fcc36d18dc5f0d90abb6c1d7c9506eaa5a"

PR = "r1"
PV = "git_${SRCREV}"

DEPENDS = "gtk+"

inherit pkgconfig

SRC_URI = "git://git.srobo.org/squidge.git;protocol=git"

CFLAGS_append = " `pkg-config --cflags gtk+-2.0 gdk-2.0`"
LDFLAGS_append = " `pkg-config --libs gtk+-2.0 gdk-2.0`"

do_compile() {
	oe_runmake CFLAGS="${CFLAGS}" LDFLAGS="${LDFLAGS}" -C ${WORKDIR}/git
}

do_install() {
	oe_runmake 'DESTDIR=${D}' PREFIX=/usr -C ${WORKDIR}/git install
}
