package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Exam Appeal", 2));
        issues.add(new Issue("System Crash", 1));
        issues.add(new Issue("Late Registration", 3));
        issues.add(new Issue("Financial Aid Problem", 2));
        issues.add(new Issue("Course Conflict", 4));
    }

    public void showMostUrgent() {
        System.out.println("Most urgent: " + issues.peek());
    }

    public void resolveIssues() {
        if (!issues.isEmpty()) issues.poll();
        if (!issues.isEmpty()) issues.poll();
    }

    public void printRemainingIssues() {
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}