DISTRO_SSH_DAEMON ?= "openssh"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = "task-boot \
        ack \
        avahi-daemon \
        binutils \
        control-freak \
        cpp \
        cpp-symlinks \
        curl \
        gcc \
        gcc-symlinks \
        git \
        htop \
        i2c-tools \
        iperf \
        libgcc-dev \
        libxml2 \
        make \
        mtr \
        nano \
        nginx \
        ntpdate \
        openssh \
        perl \
        perl-modules \
        python \
        python-flask \
        python-jinja2 \
        python-misc \
        python-modules \
        python-pyserial \
        python-pytronics \
        python-werkzeug \
        sysstat \
        usbutils \
        uwsgi \
        vim \
        vim-vimrc \
    "
export IMAGE_BASENAME = "rascal-image"

inherit image
