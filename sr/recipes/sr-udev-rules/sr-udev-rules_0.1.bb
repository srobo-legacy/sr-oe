DESCRIPTION = "SR firmware prodder scripts"
PR = "r1"
RDEPENDS = "udev"

SRC_URI = "file://99-firmware.rules \
	   file://fw-prodder"

S="${WORKDIR}"

do_install () {
	install -d ${D}/etc/udev/rules.d
	install -m 0444 ${S}/99-firmware.rules ${D}/etc/udev/rules.d

	install -d ${D}/bin
	install -m 0554 ${S}/fw-prodder ${D}/bin
}
