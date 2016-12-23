package com.icoderman.fop.model;

import org.xml.sax.InputSource;

/**
 * This class is a special InputSource decendant for using ProjectTeam
 * instances as XML sources.
 */
public class ProjectTeamInputSource extends InputSource {

    private ProjectTeam projectTeam;

    /**
     * Constructor for the ProjectTeamInputSource
     * @param projectTeam The ProjectTeam object to use
     */
    public ProjectTeamInputSource(ProjectTeam projectTeam) {
        this.projectTeam = projectTeam;
    }

    /**
     * Returns the projectTeam.
     * @return ProjectTeam
     */
    public ProjectTeam getProjectTeam() {
        return projectTeam;
    }

    /**
     * Sets the projectTeam.
     * @param projectTeam The projectTeam to set
     */
    public void setProjectTeam(ProjectTeam projectTeam) {
        this.projectTeam = projectTeam;
    }

}