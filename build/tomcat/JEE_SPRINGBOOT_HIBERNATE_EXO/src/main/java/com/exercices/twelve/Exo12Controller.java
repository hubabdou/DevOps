/* ************************************************************************** */
/* ************************************************************************** */
/* ************************** Exo12Controller.java ************************** */
/* ************************************************************************** */
/* ************************************************************************** */
/*  Filename : Exo12Controller.java                                           */
/* ************************************************************************** */
/*  Creation Date : Jan 31, 2024, 5:10:29 PM                                  */
/* ************************************************************************** */
/*  Last modified : Jan 31, 2024, 5:10:29 PM                                  */
/* ************************************************************************** */
/*  Created by : Mad <coding>                                                 */
/* ************************************************************************** */
/* ************************************************************************** */
/* ************************************************************************** */
/*                                                                            */
/*                    :::::   ::::::            ::::::::           :::::::    */
/*                  :+:   :+:+     +:+        :+:     :+:        :+:    :+:   */
/*                #:#     +:+     +:+       +:+      +:+       +:+       :+:  */
/*              +#+      #+#     +:+      +:+:+:+:+:+:+      +:+        :+:   */
/*            +#+       #:#     #+#     #+#        :+:     +:+         :+:    */
/*          +#+        #+#     #:#    +#+         #:#    #+#          :+:     */
/*        ###         ###     ###   ###          ###   #############.fr       */
/*                                                                            */
/* ************************************************************************** */

package com.exercices.twelve;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class Exo12Controller {
    @GetMapping(value="/api/cars")
    public String getCarsPage(){
        return "cars";
    }
}

/* ************************************************************************** */
/* ************************** EXO12CONTROLLER.JAVA ************************** */
/* ************************************************************************** */
