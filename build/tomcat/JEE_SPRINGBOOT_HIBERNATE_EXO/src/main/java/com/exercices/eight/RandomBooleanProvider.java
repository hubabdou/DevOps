/* ************************************************************************** */
/* ************************************************************************** */
/* *********************** RandomBooleanProvider.java *********************** */
/* ************************************************************************** */
/* ************************************************************************** */
/*  Filename : RandomBooleanProvider.java                                     */
/* ************************************************************************** */
/*  Creation Date : Jan 28, 2024, 9:09:50 AM                                  */
/* ************************************************************************** */
/*  Last modified : Jan 28, 2024, 9:09:50 AM                                  */
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

package com.exercices.eight;

import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RandomBooleanProvider {
    private final boolean value = new Random().nextBoolean();

    public boolean getValue(){
        return value;
    }
}

/* ************************************************************************** */
/* *********************** RANDOMBOOLEANPROVIDER.JAVA *********************** */
/* ************************************************************************** */
