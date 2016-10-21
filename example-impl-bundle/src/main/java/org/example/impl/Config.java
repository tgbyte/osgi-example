package org.example.impl;

import java.io.File;

import static aQute.bnd.annotation.metatype.Meta.AD;
import static aQute.bnd.annotation.metatype.Meta.OCD;

@OCD
public interface Config {

    @AD
    String hostName();

    @AD
    int port();

    @AD(required = false, deflt = "${user.home}/.cache", description = "Cache directory")
    File cacheDir();

}
