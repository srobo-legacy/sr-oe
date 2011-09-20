DESCRIPTION = "SSH host keys for SR BeagleBoards"
PR = "r0"
RDEPENDS = "dropbear"

SRC_URI = "file://dropbear.dss \
	file://dropbear.rsa"

S="${WORKDIR}"

do_install () {
	install -d ${D}/var/lib/dropbear
	install -m 0444 ${S}/dropbear.dss ${D}/var/lib/dropbear/dropbear_dss_host_key
	install -m 0444 ${S}/dropbear.rsa ${D}/var/lib/dropbear/dropbear_rsa_host_key
}
