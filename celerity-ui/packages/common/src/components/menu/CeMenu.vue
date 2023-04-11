<template>
  <menu class="menu">
    <slot></slot>
  </menu>
</template>
<script setup>

</script>
<style>
.menu {
  --menu-width: 208px;
  width: var(--menu-width);
  height: 100%;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--menu-width);
  padding: 16px;
  border-right: 1px solid #f5f5f5;
}
</style>
