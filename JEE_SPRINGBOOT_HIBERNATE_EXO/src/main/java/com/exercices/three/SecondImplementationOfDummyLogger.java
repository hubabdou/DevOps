/* ************************************************************************** */
/* ************************************************************************** */
/* ***************** SecondImplementationOfDummyLogger.java ***************** */
/* ************************************************************************** */
/* ************************************************************************** */
/*  Filename : SecondImplementationOfDummyLogger.java                         */
/* ************************************************************************** */
/*  Creation Date : Jan 26, 2024, 4:27:05 PM                                  */
/* ************************************************************************** */
/*  Last modified : Jan 26, 2024, 4:27:05 PM                                  */
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

package com.exercices.three;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class SecondImplementationOfDummyLogger implements DummyLogger {

    @Override
    public void sayHello() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        log.info("hello from second !");
    }

}

/* ************************************************************************** */
/* ***************** SECONDIMPLEMENTATIONOFDUMMYLOGGER.JAVA ***************** */
/* ************************************************************************** */
