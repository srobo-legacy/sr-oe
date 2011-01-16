# This recipe is based upon upstream OE's linux-omap-psp_2.6.32 recipe.
# It makes handling the patches that contains easier, by keeping them
# in an external git repository.
require multi-kernel.inc

DESCRIPTION = "Linux kernel for OMAP processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard"

# This is TI's v2.6.32_OMAPPSP_03.00.01.06 branch,
# with the patches from the linux-omap-psp_2.6.32 recipe applied on top,
# as well as any additional patches that SR needs to live
SRCREV = "ea8ce293810ce84f227aa14a042265a4d0d8760e"

MACHINE_KERNEL_PR_append = "+gitr${SRCREV}"

SRC_URI = "git://srobo.org/linux-2.6-bb.git;protocol=git;branch=2.6.32-psp \
           file://defconfig"

addtask quiltfixup before do_patch after do_unpack
do_quiltfixup() {
	rm ${S}/.pc -rf
}

S = "${WORKDIR}/git"
