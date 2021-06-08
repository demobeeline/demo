package com.test.demo.functions

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/api/phones")
class PhonesFunctions {
    @GetMapping
    fun getPhones(): List<Phones> =
        phonesFunction.getPhones()

    @PostMapping
    fun addPhones(@Valid @RequestBody phones: Phones): ResponseEntity<Phones> =
        phonesFunction.addPhones(phone)

    @GetMapping("/{id}")
    fun getPhonesById(@PathVariable(value = "id") PhonesId: Long): ResponseEntity<Phones> =
        phonesFunction.getPhonesById(PhonesId)

    @PutMapping("/{id}")
    fun updatePhonesById(
        @PathVariable(value = "id") PhonesId: Long,
        @Valid @RequestBody newPhones: Phones): ResponseEntity<Phones> =
        phonesFunction.putPhones(PhonesId, newPhones)

    @DeleteMapping("/{id}")
    fun deletePhones(@PathVariable(value = "id") phoneId: Long): ResponseEntity<Void> =
        phonesFunction.deletePhones(PhonesId)
}