/* ************************************************************************** */
/* ************************************************************************** */
/* ************************* UserFormResponse.java ************************** */
/* ************************************************************************** */
/* ************************************************************************** */
/*  Filename : UserFormResponse.java                                          */
/* ************************************************************************** */
/*  Creation Date : Feb 26, 2024, 7:43:26 PM                                  */
/* ************************************************************************** */
/*  Last modified : Feb 26, 2024, 7:43:26 PM                                  */
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

package com.exercices.ten.otherclass;

import com.exercices.ten.entity.UserBook;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFormResponse {
    private UserBook user;
    private String message;
    private int code;
    private String token;
}

/* ************************************************************************** */
/* ************************* USERFORMRESPONSE.JAVA ************************** */
/* ************************************************************************** */