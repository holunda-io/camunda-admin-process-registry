package io.holunda.camunda.platform.adminprocess.form

import io.holunda.camunda.bpm.data.CamundaBpmData
import java.util.*

/**
 * Defines a Date picker field.
 * @param id id of the field.
 * @param label label of the field in the form.
 */
data class DateField(
  override val id: String,
  override val label: String
) : FormField<Date>(id, label, null, "date", CamundaBpmData.dateVariable(id))
