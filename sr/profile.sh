# On initial checkout, this will be set to "MAGIC_BEES_1234"
# The "checkout" script will replace this with an 
# absolute path.
export OE_HOME="MAGIC_BEES_1234"

if [[ "$OE_HOME" == "MAGIC_BEES_1234" ]]
then
    echo "Error: OE_HOME has not been set -- consult the SR BeagleBoard docs"
    return 0
fi

export MY_OE_CONF="beagleboard"
export BBPATH=$OE_HOME/sr:$OE_HOME/sr/$MY_OE_CONF:$OE_HOME/openembedded
export BB_ENV_EXTRAWHITE="MACHINE DISTRO ANGSTROM_MODE ANGSTROMLIBC OE_HOME"
export PATH=$OE_HOME/opt/bitbake/bin:$PATH
if [ "$PS1" ]; then
  if [ "$BASH" ]; then
    export PS1="\[\033[01;32m\]OE:$MY_OE_CONF\[\033[00m\] ${PS1}"
  fi
fi
