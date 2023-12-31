package symphony

import neat.ValidationFactory
import kotlin.reflect.KMutableProperty0

fun Fields<*>.money(
    name: KMutableProperty0<Double?>,
    value: Double? = name.get(),
    label: String = name.name,
    hint: String = label,
    visibility: Visibility = Visibilities.Visible,
    onChange: Changer<Double>? = null,
    factory: ValidationFactory<Double>? = null
): NumberField<Double> = double(name, value, label, hint, visibility, onChange, factory)