# language: en

Feature: User can tag Tickets as internal or external

    Scenario: A recently created Ticket needs to be tagged as external to show it belongs to an external project
        Given a Ticket as internal
        When a user wants to tag it as "EXTERNAL"
        Then it should be left marked as "EXTERNAL"
