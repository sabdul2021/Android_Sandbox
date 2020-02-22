
//
//  ViewController.swift
//  AutoPushNotificiations
//
//  Created by Jeffrey Seaman on 2/22/20.
//  Copyright © 2020 PPU. All rights reserved.
//

import UIKit
import UserNotifications

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        let center = UNUserNotificationCenter.current()
       
        center.requestAuthorization(options: [.alert, .sound])
        { (granted, error) in
            
        }
        
        //Step 2: Create the notification content
        let content = UNMutableNotificationContent()
        content.title = "Dinner is being served in the Shady Room"
        content.body = "ShadySide House"
        
        //Step 3: Create the notification trigger
        let date = Date().addingTimeInterval(5)
        let dateComponents = Calendar.current.dateComponents([.year, .month, .day, .hour, .minute, .second], from: date)
        
        let trigger = UNCalendarNotificationTrigger(dateMatching: dateComponents, repeats: false)
        
        //Step 4: Create the request
        let uuidString = UUID().uuidString
        
        let request = UNNotificationRequest(identifier: uuidString, content: content, trigger: trigger)
        
        //Step 5: Register the request with notificiation center
        center.add(request) { ( error) in
            //Check the error param and handle any errors
        }
    }

}

