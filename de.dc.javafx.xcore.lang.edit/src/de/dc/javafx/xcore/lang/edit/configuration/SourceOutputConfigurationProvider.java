package de.dc.javafx.xcore.lang.edit.configuration;
import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class SourceOutputConfigurationProvider implements
    IOutputConfigurationProvider {

public final static String DEFAULT_SRC = "DEFAULT_SRC";
public final static String DEFAULT_OUTPUT = IFileSystemAccess.DEFAULT_OUTPUT;

/**
 * @return a set of {@link OutputConfiguration} available for the generator
 */
public Set<OutputConfiguration> getOutputConfigurations() {
    OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
    defaultOutput.setDescription("Src-Gen Output Folder");
    defaultOutput.setOutputDirectory("./src-gen");
    defaultOutput.setOverrideExistingResources(true);
    defaultOutput.setCreateOutputDirectory(true);
    defaultOutput.setCleanUpDerivedResources(true);
    defaultOutput.setSetDerivedProperty(true);

    OutputConfiguration onceOutput = new OutputConfiguration(DEFAULT_SRC);
    onceOutput.setDescription("Src Output Folder (once)");
    onceOutput.setOutputDirectory("./src");
    onceOutput.setOverrideExistingResources(false);
    onceOutput.setCreateOutputDirectory(true);
    onceOutput.setCleanUpDerivedResources(false);
    onceOutput.setSetDerivedProperty(true);
    return newHashSet(defaultOutput, onceOutput);
}

}