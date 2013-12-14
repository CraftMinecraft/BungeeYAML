package net.craftminecraft.bungee.bungeeyaml.supereasyconfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Bungee's SuperEasyConfig - ItemPath
 * 
 * Based off of MrFigg's SuperEasyConfig v1.2
 * which was inspired by codename_Bs
 * which was inspired by md_5
 * which was inspired by... oh no, that's it.
 * 
 * Super Lazy Configuration for BungeeCord.
 * Includes support for Guava Library's collection types.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * @author MrFigg
 * @author roblabla
 * 
 * @version 1.2
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Path {
    String value();
}
