package com.familyhouse.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("Family House is a 501(c)(3) non-profit charitable organization greatly supported by community donations whose mission is to. It provides a convenient and affordable “home away from home” for patients and their caregivers who must travel to Pittsburgh for medical treatment of life-threatening illness.");

        List<String> football = new ArrayList<String>();
        football.add("Family House is a 501(c)(3) non-profit charitable organization governed by a community Board of Directors. We rely on donations to support the homes and services provided to all guests. \n" +
                "Family House’s charitable care—which is the difference between what a room costs the organization to operate vs. what Family House charges—amounts to more than $1.2 million annually. These funds are provided each year through generous contributions from individuals, companies, foundations, and other organizations.\n");


        List<String> basketball = new ArrayList<String>();
        basketball.add("Family House has three locations in Pittsburgh’s Oakland and Shadyside neighborhoods. Family House Neville is located at 514 N. Neville St., Pittsburgh, PA, 15213; \n" +
                "Family House Shadyside is located at 5245 Centre Ave., Pittsburgh, PA, 15232; and \n" +
                "Family House University Place is located at 116 Thackeray Ave.,  Pittsburgh, PA, 15213.\n");


        expandableListDetail.put("What is Family House?", cricket);
        expandableListDetail.put("Where is Family House Located?", football);
        expandableListDetail.put("How is Family House funded?", basketball);
        return expandableListDetail;
    }
}
