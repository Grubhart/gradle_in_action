package com.manning.gia


import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ProjectVersion{

    Integer major
    Integer minor
    Boolean release

    ProjectVersion(Integer major, Integer minor) {
        this.major = major
        this.minor = minor
        this.release = false
    }

    ProjectVersion(Integer major, Integer minor, Boolean release) {
        this(major,minor)
        this.release = release
    }

    @Override
    String toString(){
        "$major.$minor${release?'' : '-SNAPSHOT'}"
    }
}