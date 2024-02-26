poolobject
==========

[![Java CI](https://github.com/hds1001/poolobject/actions/workflows/ci_jdk11_build.yml/badge.svg)](https://github.com/hds1001/poolobject/actions/workflows/ci_jdk11_build.yml) 
[![Java CI](https://github.com/hds1001/poolobject/actions/workflows/ci_jdk1.8_build_test.yml/badge.svg)](https://github.com/hds1001/poolobject/actions/workflows/ci_jdk1.8_build_test.yml) 
[![codecov](https://codecov.io/gh/hds1001/poolobject/graph/badge.svg?token=NvQ17D5kct)](https://codecov.io/gh/hds1001/poolobject)

Java code example of creational design pattern pool object

Workshop to use good practices in software development: testing, ci and measurement.

## Authors:

- [Hugo de la Camara Saiz](mailto:hds1001@alu.ubu.es)
- [Carlos Barrio Riesco](mailto:cbr1005@alu.ubu.es)

## Objetivos
- Comprender los objetivos de medición relacionados con la caracterización y la evaluación de productos, procesos y recursos software
- Comprender, aplicar y analizar técnicas de medición sobre entidades de productos software relacionados con conjuntos de pruebas de software
- Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos de prueba del software

## Enunciado
En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.
El objetivo es establecer un caso de estudio dummy que sirva para caracterizar y evaluar tanto el producto
desarrollado como el proceso seguido.

## Preguntas:

### 1. ¿Se ha realizado trabajo en equipo?
Como se puede comprobar en los diferentes commits que hemos ido realizando, hemos progresado de poco en poco, avanzando con el codigo en local hasta finalizarlo y poder 
realizar varios PUSH de golpe con todo funcionando.

### 2. ¿Tiene calidad el conjunto de pruebas disponibles?
Tras realizar las pruebas en Codecov obtenemos una calidad de codigo de 77% la cual consideramos buena. Lo restante puede ser por la falta de analisis en la clase del Cliente
![image](https://github.com/hds1001/poolobject/assets/93576975/905ca350-9ef8-4395-aa9c-a271867df7af)

### 3. ¿Cuál es el esfuerzo invertido en realizar la actividad?
El dia 22 de febrero invertimos 1 hora en comprender lo que se pedia y comenzar con la actividad.
El dia 23 de febrero invertimos 1 hora en preparar los archivos y avanzar con los tests.
El dia 25 invertimos 1 hora en trabajar los métodos en local.
El dia 26 invertimos 1 hora en pulir las mejoras y subirla a GitHub.
En total se han invertido unas 4 horas aproximadamente.


### 4. ¿Cuál es el número de fallos encontrados en el código?
Dentro de la clase de los tests solo hemos encontrado 1 fallo una vez finalizada la actividad, y es que el constructor deberia ser publico.
La clase Cliente tambien da fallos pero no es de la incunvencia de esta práctica.

