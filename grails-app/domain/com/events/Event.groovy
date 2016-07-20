package com.events

class Event {

    String id
    String name
    String description
    String location

    static constraints = {
        id blank: false
        name blank: false
    }
}
