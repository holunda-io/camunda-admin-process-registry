package io.holunda.camunda.platform.adminprocess.form

import io.holunda.camunda.bpm.data.CamundaBpmDataKotlin

/**
 * Form field for numeric input.
 * @param id id of the field.
 * @param label label of the field in the form.
 */
data class LongField(
  override val id: String,
  override val label: String
) : FormField<Long>(id, label, null, "long", CamundaBpmDataKotlin.longVariable(id).nonNull)
