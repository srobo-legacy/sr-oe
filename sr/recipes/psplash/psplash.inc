DESCRIPTION = "Userspace framebuffer boot logo based on usplash."
HOMEPAGE = "http://projects.o-hand.com/psplash"
SECTION = "base"
LICENSE = "GPLv2+"
PROVIDES = "virtual/psplash"
RPROVIDES_${PN} = "virtual-psplash"
RCONFLICTS_${PN} = "exquisite"

PV = "0.0+gitr${SRCPV}"
PR = "r36"

inherit autotools pkgconfig update-rc.d

do_install_prepend() {
	install -d ${D}/mnt/.splash/
	install -d ${D}${sysconfdir}/default/
	install -m 0644 ${WORKDIR}/psplash-default ${D}${sysconfdir}/default/psplash
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/psplash-init ${D}${sysconfdir}/init.d/psplash
	install -d ${D}${bindir}
	ln -s psplash-write ${D}${bindir}/splash-write
	install -d ${D}${sysconfdir}/default
	install -m 0755 ${WORKDIR}/splashfuncs ${D}${sysconfdir}/default/splashfuncs
}

INITSCRIPT_NAME = "psplash"
INITSCRIPT_PARAMS = "start 01 S . stop 20 0 1 6 ."

PACKAGES =+ "psplash-support"

RDEPENDS_${PN} += "psplash-support"
FILES_psplash-support += "/mnt/.splash ${sysconfdir} ${bindir}/psplash-write ${bindir}/splash-write"
