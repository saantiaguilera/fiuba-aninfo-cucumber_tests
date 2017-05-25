$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("project_manager.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 3,
  "name": "Project manager features between his employees and the bussiness elements, such as tickets of the employees projects",
  "description": "",
  "id": "project-manager-features-between-his-employees-and-the-bussiness-elements,-such-as-tickets-of-the-employees-projects",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "An issue has just been created and has to be assigned to a user who will be in charge of its develop",
  "description": "",
  "id": "project-manager-features-between-his-employees-and-the-bussiness-elements,-such-as-tickets-of-the-employees-projects;an-issue-has-just-been-created-and-has-to-be-assigned-to-a-user-who-will-be-in-charge-of-its-develop",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a user whose name is \"Santiago\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a created ticket with title \"Cant login correctly\" its assigned to him",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "\"Santiago\" becomes an assignee of the ticket",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Cant login correctly",
      "offset": 29
    }
  ],
  "location": "IssueAssignTest.whenHeGetsAsignedATicketOf(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Santiago",
      "offset": 1
    }
  ],
  "location": "IssueAssignTest.thenTheUserIsAnAssigneeOfTheTicket(String)"
});
formatter.result({
  "status": "skipped"
});
});