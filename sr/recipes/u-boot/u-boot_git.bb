require u-boot.inc
PR ="r31"

FILESPATHPKG =. "u-boot-git:"

SRC_URI = "git://www.denx.de/git/u-boot.git;protocol=git "
SRCREV_davinci-sffsdr = "4b50cd12a3b3c644153c4cf393f4a4c12289e5aa"
SRCREV_akita = "9bf86baaa3b35b25baa2d664e2f7f6cafad689ee"
SRCREV_spitz = "9bf86baaa3b35b25baa2d664e2f7f6cafad689ee"
SRCREV_c7x0 = "9bf86baaa3b35b25baa2d664e2f7f6cafad689ee"
SRCREV_afeb9260 = "6b8edfde22acc574b5532e9f086e6a7287a9bc78"
SRCREV_afeb9260-180 = "6b8edfde22acc574b5532e9f086e6a7287a9bc78"
SRC_URI_append_afeb9260 = " file://AFEB9260-network-fix.patch;patch=1"
SRC_URI_append_afeb9260-180 = " file://AFEB9260-network-fix.patch;patch=1"

SRC_URI_beagleboard = "git://www.denx.de/git/u-boot.git;protocol=git \
		    file://sr/0001-Disable-the-display.patch \
		    file://sr/0002-Set-pin-mux-in-u-boot-to-give-GPIO144-rather-than-UA.patch \
"

SRCREV_beagleboard = "279bbbca12e71ae68278b756048194003a6d6e21"
PV_beagleboard = "2011.09+${PR}+gitr${SRCREV}"

SRC_URI_omap3-touchbook = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git \
                 file://fw-env.patch;patch=1 \
                 file://dss2.patch;patch=1 \
                 file://spi3.patch;patch=1 \
                 file://spi4.patch;patch=1 \
                 file://headphone.patch;patch=1 \
"
SRCREV_omap3-touchbook = "d363f9cb0918a1b6b92e2e20d01543d0c4f53274"
PV_omap3-touchbook = "2009.05+${PR}+gitr${SRCREV}"


SRC_URI_omap3evm = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git"
SRCREV_omap3evm = "2dea1db2a3b7c12ed70bbf8ee50755089c5e5170"
PV_omap3evm = "2009.03+${PR}+gitr${SRCREV}"


SRCREV_omap3517-evm = "e60beb13cf0"
SRC_URI_append_omap3517-evm = " \
file://omap3evm/0001-Changes-for-making-a-NAND-build.patch;patch=1 \
file://omap3evm/0002-Fix-for-NFS-boot-for-OMAP3-EVM.patch;patch=1 \
file://omap3evm/0003-OMAP3-timer-handling-to-1ms-tick-and-CONFIG_SYS_HZ-t.patch;patch=1 \
file://omap3evm/0004-Reverse-patch-for-NFS-boot-to-fix-comments-provided.patch;patch=1 \
file://omap3evm/0005-SMC911x-driver-fixed-for-NFS-boot.patch;patch=1 \
file://omap3evm/0006-Added-OMAP3517-3505-support.patch;patch=1 \
file://omap3evm/0007-OMAP3517TEB-validated-on-OMAP3517TEB-board.patch;patch=1 \
file://omap3evm/0008-OMAP3517PRE-ALPHA-validated-on-OMAP3517PRE_ALPHA-bo.patch;patch=1 \
file://omap3evm/0009-OMAP3517PRE-ALPHA-DDR-size-issue-fixed.patch;patch=1 \
file://omap3evm/0010-OMAP3517PRE-ALPHA-Mux-configuration-for-MMC-CD-and.patch;patch=1 \
file://omap3evm/0011-Ethernet-driver-functional-no-need-for-time-delay.patch;patch=1 \
file://omap3evm/0012-EMAC-driver-Implement-GPIO-driven-PHY-reset.patch;patch=1 \
file://omap3evm/0013-Cleaned-up-during-EVM-hang-issue.patch;patch=1 \
file://omap3evm/0014-EMAC-driver-cleanup-removed-debug-prints.patch;patch=1 \
file://omap3evm/0015-EMAC-driver-Check-for-link-status-in-packet-send-lo.patch;patch=1 \
file://omap3evm/0016-Config-option-and-name-changed-to-omap3517_evm.patch;patch=1 \
"
PV_omap3517-evm = "2009.03+${PR}+gitr${SRCREV}"

SRC_URI_omapzoom = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3-dev;protocol=git"
SRCREV_omapzoom = "d691b424f1f5bf7eea3a4131dfc578d272e8f335"
PV_omapzoom = "2009.01+${PR}+gitr${SRCREV}"

SRCREV_omapzoom2 = "3672cd5c3b53d219d33345eebad4e25ad5bf6d52"
PV_omapzoom2 = "2009.05+${PR}+gitr${SRCREV}"

SRC_URI_overo = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git \
                 file://fw-env.patch;patch=1 \
                 file://dss2.patch;patch=1 \
"
SRCREV_overo = "2dea1db2a3b7c12ed70bbf8ee50755089c5e5170"
PV_overo = "2009.03+${PR}+gitr${SRCREV}"

SRC_URI_dm6446-evm = "git://arago-project.org/git/projects/u-boot-davinci.git;protocol=git"
SRCREV_dm6446-evm = "f8d047c84137ab331c0ee2c3e94c3f1ec4228298"
PV_dm6446-evm = "2009.05+2009.06-rc0+gitr${SRCREV}"

SRC_URI_dm355-evm = "git://arago-project.org/git/projects/u-boot-davinci.git;protocol=git"
SRCREV_dm355-evm = "5ae613482c9468386872cedd46f8fb389f19859d"
PV_dm355-evm = "2009.08+gitr${SRCREV}"

SRC_URI_dm365-evm = "git://arago-project.org/git/projects/u-boot-davinci.git;protocol=git"
SRCREV_dm365-evm = "5ae613482c9468386872cedd46f8fb389f19859d"
PV_dm365-evm = "2009.08+gitr${SRCREV}"

SRC_URI_dm6467-evm = "git://arago-project.org/git/people/hemant/u-boot-dm646x.git;protocol=git"
SRCREV_dm6467-evm = "3da7475ae13445ba89c77ea563ccdfb9df540bb7"
PV_dm6467-evm = "2009.08+gitr${SRCREV}"

SRC_URI_dm6467t-evm = "git://arago-project.org/git/people/hemant/u-boot-dm646x.git;protocol=git"
SRCREV_dm6467t-evm = "3da7475ae13445ba89c77ea563ccdfb9df540bb7"
PV_dm6467t-evm = "2009.08+gitr${SRCREV}"

SRC_URI_da830-omapl137-evm = "git://arago-project.org/git/people/sekhar/u-boot-omapl1.git;protocol=git;branch=wakeup"
SRCREV_da830-omapl137-evm = "04a03bb477ad842b84c61b29f11422089ad0088d"
PV_da830-omapl137-evm = "2009.01+gitr${SRCREV}"

SRC_URI_da850-omapl138-evm = "git://arago-project.org/git/people/sekhar/u-boot-omapl1.git;protocol=git;branch=wakeup"
SRCREV_da850-omapl138-evm = "04a03bb477ad842b84c61b29f11422089ad0088d"
PV_da850-omapl138-evm = "2009.01+gitr${SRCREV}"

SRC_URI_dm355-leopard = "git://www.denx.de/git/u-boot-arm.git;protocol=git;branch=next \
                        file://leopardboard-support.patch;patch=1 \
"
SRCREV_dm355-leopard = "86d5c98d3d97d631b1d3a5f5e6a17e87c99b42cf"
PV_dm355-leopard = "2009.05+2009.06-rc2+gitr${SRCREV}"

SRC_URI_neuros-osd2 = "git://github.com/neuros/u-boot.git;protocol=git;branch=neuros"
SRCREV_neuros-osd2 = "8de979d346624c0e4cfe2e5c0f08ce20ca4b5d14"

SRC_URI_sequoia = "git://www.denx.de/git/u-boot.git;protocol=git"
SRCREV_sequoa = "cf3b41e0c1111dbb865b6e34e9f3c3d3145a6093"

SRC_URI_sequoia = "git://www.denx.de/git/u-boot.git;protocol=git;tag=cf3b41e0c1111dbb865b6e34e9f3c3d3145a6093 "

SRC_URI_mini2440 = "git://repo.or.cz/u-boot-openmoko/mini2440.git;protocol=git;branch=dev-mini2440-stable"
SRCREV_mini2440 = "3516c35fb777ca959e5cadf2156a792ca10e1cff"

SRC_URI_micro2440 = "git://repo.or.cz/u-boot-openmoko/mini2440.git;protocol=git;branch=dev-mini2440-stable"
SRCREV_micro2440 = "3516c35fb777ca959e5cadf2156a792ca10e1cff"

SRC_URI_neuros-osd2 += "file://Makefile-fix.patch;patch=1"
SRC_URI_append_akita = "file://pdaXrom-u-boot.patch;patch=1 \
                        file://uboot-eabi-fix-HACK2.patch;patch=1 \
                        file://akita-standard-partitioning.patch;patch=1 \
                       "
SRC_URI_append_spitz = "file://pdaXrom-u-boot.patch;patch=1 \
                        file://uboot-eabi-fix-HACK2.patch;patch=1 \
                        file://spitz-standard-partitioning.patch;patch=1 \
                       "
SRC_URI_append_c7x0 = "file://pdaXrom-u-boot.patch;patch=1 \
                       file://uboot-eabi-fix-HACK2.patch;patch=1 \
                       file://corgi-standard-partitioning.patch;patch=1 \
                       "
S = "${WORKDIR}/git"


do_configure_prepend_akita() {
        sed -i s:ROOT_FLASH_SIZE:${ROOT_FLASH_SIZE}:g ${S}/include/configs/akita.h
}

do_configure_prepend_spitz() {
        sed -i s:ROOT_FLASH_SIZE:${ROOT_FLASH_SIZE}:g ${S}/include/configs/akita.h
}

do_configure_prepend_c7x0() {
        sed -i s:ROOT_FLASH_SIZE:${ROOT_FLASH_SIZE}:g ${S}/include/configs/corgi.h
}

do_deploy_prepend_mini2440() {
	cp ${S}/u-boot-nand16k.bin ${S}/u-boot.bin
}

do_deploy_prepend_micro2440() {
	cp ${S}/u-boot-nand16k.bin ${S}/u-boot.bin
}
