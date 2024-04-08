/* ************************************************************************** */
/* ************************************************************************** */
/* ************************* Exo5Configuration.java ************************* */
/* ************************************************************************** */
/* ************************************************************************** */
/*  Filename : Exo5Configuration.java                                         */
/* ************************************************************************** */
/*  Creation Date : Jan 28, 2024, 12:29:18 PM                                 */
/* ************************************************************************** */
/*  Last modified : Jan 28, 2024, 12:29:18 PM                                 */
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

package com.exercices.five;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Exo5Configuration {
    @Bean
    public WelcomeMessageLogger welcomeMessageLogger(@Value("${pl.sdacademy.welcome.text.value:none}") final String txt,
        @Value("${pl.sdacademy.welcome.text.enable:true}") final boolean should){
        return new WelcomeMessageLogger(txt, should);
    }
}

/* ************************************************************************** */
/* ************************* EXO5CONFIGURATION.JAVA ************************* */
/* ************************************************************************** */
