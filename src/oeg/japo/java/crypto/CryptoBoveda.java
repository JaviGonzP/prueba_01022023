/*
 * Copyright 2023 alumnoT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package oeg.japo.java.crypto;

/**
 *
 * @author alumnoT
 */
public final class CryptoBoveda {
 
 private static final long OFFSET = 7;
 
 private CryptoBoveda(){
     
 }
   
public static final char encriptarCaracter(char c){
    return (char)(c + OFFSET);
}

public static final char desencriptarCaracter(char c){
    return (char)(c - OFFSET);
}
public static final char encriptarDigito(char c){
    return c + OFFSET > '9' ? (char)('0' + c + OFFSET - '9' - 1) : (char)(c + OFFSET) ;
}
public static final char desencriptarDigito(char c){
     return c - OFFSET < '0' ? '9' : (char)(c + OFFSET);
}
//public static final String encriptarTexto(String texto){
//    
//}
//public static final String desencriptarTexto(String texto){
//    
//}
//public static final int encriptarEntero(int n){
//    
//}
//public static final int desencriptarEntero(int n){
//    
//}
}
