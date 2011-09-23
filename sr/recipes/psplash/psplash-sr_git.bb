require psplash.inc
require psplash-ua.inc

SRCREV="220eb45b65fad322b5d36504d19900128a62f97a"

ALTERNATIVE_PRIORITY = "20"

SRC_URI = "git://srobo.org/beagleboard/psplash.git;protocol=git \
          file://psplash-default \
          file://splashfuncs \
          file://psplash-init"
S = "${WORKDIR}/git"

