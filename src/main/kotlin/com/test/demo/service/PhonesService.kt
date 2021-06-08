package com.test.demo.service
import com.test.demo.model.Phones
import com.test.demo.repository.PhonesRep
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

class PhonesService {

    fun getTasks(): List<Phones> =
        PhonesRep.findAll()

    fun addTask(phones: Phones): ResponseEntity<Phones> =
        ResponseEntity.ok(PhonesRep.save(phones))

    fun getPhonesById(PhonesId: Long): ResponseEntity<Phones> =
        PhonesRep.findById(PhonesId).map { phones ->
            ResponseEntity.ok(phones)
        }

    fun putPhones(PhonesId: Long, newPhones: Phones): ResponseEntity<Phones> =
        PhonesRep.findById(phoneId).map {
            val updatedPhones: Phones =
                currentPhones
                    .copy(
                        id = newPhones.id,
                        phone_name = newPhones.phone_name,
                        memory = newPhones.memory,
                        color = newPhones.color,
                        description = newPhones.description,
                    )
            ResponseEntity.ok().body(PhonesRep.save(updatedPhones))
        }

    fun deletePhones(PhonesId: Long): ResponseEntity<Void> =
        PhonesRep.findById(PhonesId).map { task ->
            PhonesRep.delete(task)
            ResponseEntity<Void>(HttpStatus.ACCEPTED)
        }
}