DESCRIPTION = "Collection of Python libraries for simulating the irradiation of any point on earth by the sun"
HOMEPAGE = "http://pysolar.org"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;beginline=1;endline=2;md5=b428d61675eb7587b83118250ec239f4"
SRCNAME = "pysolar"
PR = "r0"

S = "${WORKDIR}/git"

SRCREV = "0.4.4"
SRC_URI = "git://github.com/pingswept/pysolar.git;protocol=git;branch=master"

inherit distutils

RDEPENDS_${PN} = "\
  python-core \
"