<template>
  <div>
    <DeclarativeRendering />
    <AttributeBindings />
    <EventListeners />
    <FormBindings />
    <ConditionalRenderin />
    <ListRendering />
    <ComputedProperty />
    <LifecycleAndTemplateRefs />
    <Watchers />
    <Components />
    <Props />
    <Emits />
    <Slots />
    <Test1Components />
    <Test2Components />
  </div>
</template>

<script>
import DeclarativeRendering from "@/components/DeclarativeRendering.vue";
import AttributeBindings from "@/components/AttributeBindings.vue";
import EventListeners from "@/components/EventListeners.vue";
import FormBindings from "@/components/FormBindings.vue";
import ConditionalRenderin from "@/components/ConditionalRenderin.vue";
import ListRendering from "@/components/ListRendering.vue";
import ComputedProperty from "@/components/ComputedProperty.vue";
import LifecycleAndTemplateRefs from "@/components/LifecycleAndTemplateRefs.vue";
import Watchers from "@/components/Watchers.vue";
import Components from "@/components/Components.vue";
import ComponentsChildComp from "@/components/ComponentsChildComp.vue";
import Props from "@/components/Props.vue";
import PropsChildComp from "@/components/PropsChildComp.vue";
import Emits from "@/components/Emits.vue";
import EmitsChildComp from "@/components/EmitsChildComp.vue";
import Slots from "@/components/Slots.vue";
import SlotsChildComp from "@/components/SlotsChildComp.vue";
import Test1Components from "@/Test/Test1Components.vue";
import Test2Components from "@/Test/Test2Components.vue";

export default {
  name: 'App',
  components: {
    Test2Components,
    Test1Components,
    SlotsChildComp,
    Slots,
    EmitsChildComp,
    Emits,
    PropsChildComp,
    Props,
    ComponentsChildComp,
    Components,
    Watchers,
    LifecycleAndTemplateRefs,
    ComputedProperty,
    ListRendering,
    ConditionalRenderin,
    FormBindings,
    EventListeners,
    AttributeBindings,
    DeclarativeRendering
  },
  data() {
    return {};
  }
}
</script>

<style lang="scss" scoped>

</style>