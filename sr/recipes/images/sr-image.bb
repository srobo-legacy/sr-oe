IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

ANGSTROM_EXTRA_INSTALL ?= ""

SPLASH ?= ""
ZZAPSPLASH = ' ${@base_contains("MACHINE_FEATURES", "screen", "psplash-zap", "",d)}'

DEPENDS = "task-base-extended \
           ${SPLASH} \
           ${ZZAPSPLASH} \
	   zlib iotop ipython \
	   python ipkg zile \
	   c2py"

# c2py is intentionally left out here, as it's shipped in robot.zip
IMAGE_INSTALL = "task-base-extended \
            ${ANGSTROM_EXTRA_INSTALL} \
            ${SPLASH} \
            ${ZZAPSPLASH} \
	    zlib iotop ipython \
	    python python-modules ipkg zile"

export IMAGE_BASENAME = "sr-image"
IMAGE_LINGUAS = ""

inherit image
