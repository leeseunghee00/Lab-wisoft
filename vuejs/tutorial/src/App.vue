<template>
  <div>
    <DeclarativeRendering />
    <AttributeBindings />
    <EventListeners />
    <FormBindings />
    <ConditionalRenderin />
    <ListRendering />
    <ComputedProperty />
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


export default {
  name: 'App',
  components: {
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