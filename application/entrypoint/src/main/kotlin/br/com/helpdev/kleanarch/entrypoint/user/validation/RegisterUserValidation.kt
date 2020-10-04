package br.com.helpdev.kleanarch.entrypoint.user.validation

import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserRequestDTO

const val NAME_CANT_BE_BLANK = "O NOME NÃO PODE SER EM BRANCO"
const val LAST_NAME_CANT_BE_BLANK = "O SOBRENOME NÃO PODE SER EM BRANCO"
const val MIN_AGE = 0
const val MAX_AGE = 150
const val AGE_MUST_BE_BETWEEN = "A IDADE DEVE ESTAR ENTRE $MIN_AGE E $MAX_AGE"

fun RegisterUserRequestDTO.validate(): Set<String> {
    return HashSet<String>().apply {
        if (firstName.isBlank()) {
            add(NAME_CANT_BE_BLANK)
        }
        if (lastName.isBlank()) {
            add(LAST_NAME_CANT_BE_BLANK)
        }
        if (age < MIN_AGE || age > MAX_AGE) {
            add(AGE_MUST_BE_BETWEEN)
        }
    }

}