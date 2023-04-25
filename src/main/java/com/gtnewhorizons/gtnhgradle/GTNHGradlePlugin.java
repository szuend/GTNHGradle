/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gtnewhorizons.gtnhgradle;

import com.gtnewhorizons.retrofuturagradle.UserDevPlugin;
import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.JavaLibraryPlugin;
import org.gradle.api.plugins.PluginManager;

/**
 * A simple 'hello world' plugin.
 */
public class GTNHGradlePlugin implements Plugin<Project> {

    public void apply(Project project) {
        final PluginManager plugins = project.getPluginManager();
        plugins.apply(JavaLibraryPlugin.class);
        plugins.apply(UserDevPlugin.class); // Apply RFG
    }
}
