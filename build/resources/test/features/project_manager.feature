# language: en

Feature: Project manager features between his employees and the bussiness elements, such as tickets of the employees projects

    Scenario: An issue has just been created and has to be assigned to a user who will be in charge of its develop
        Given a user whose name is "Santiago"
        When a created ticket with title "Cant login correctly" its assigned to him
        Then "Santiago" becomes an assignee of the ticket
