myloc=$(readlink -f ${BASH_SOURCE[0]})
export OE_HOME=$(readlink -f $(dirname ${myloc})/.. )

export MY_OE_CONF="beagleboard"
export BBPATH=$OE_HOME/sr:$OE_HOME/sr/$MY_OE_CONF:$OE_HOME/openembedded
export BB_ENV_EXTRAWHITE="MACHINE DISTRO ANGSTROM_MODE ANGSTROMLIBC OE_HOME"
export PATH=$OE_HOME/opt/bitbake/bin:$PATH
if [ "$PS1" ]; then
  if [ "$BASH" ]; then
    export PS1="\[\033[01;32m\]OE:$MY_OE_CONF\[\033[00m\] ${PS1}"
  fi
fi
