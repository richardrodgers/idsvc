/**
 * Copyright 2014 MIT Libraries
 * Licensed under: http://www.apache.org/licenses/LICENSE-2.0
 */
package edu.mit.lib.idsvc.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of a work - which is an intellectual
 * product authored by persons - and its author names, and authors
 * 
 * @author richardrodgers
 */

public class WorkGraph {

    private Work work;
    private List<Person> authors;
    private List<Name> names;

    public WorkGraph(Work work, List<Person> authors, List<Name> names) {
        this.work = work;
        this.authors = authors;
        this.names = names;
    }

    @JsonProperty
    public Work getWork() {
        return work;
    }

    @JsonProperty
    public List<Name> getNames() {
        return names;
    }

    @JsonProperty
    public List<Person> getAuthors() {
        return authors;
    }
}
