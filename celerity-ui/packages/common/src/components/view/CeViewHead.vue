<template>
<div class="view-head">
  <slot></slot>
</div>
</template>
<script setup>
</script>
<style lang="scss">
.view-head {
  --view-head-height: 64px;
  --view-head-height: 104px;
  height: var(--view-head-height);
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--view-head-height);
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  justify-content: space-between;
  //justify-content: flex-start;
  align-items: center;
  align-items: flex-start;
  padding: 0 16px;
  /* border-bottom: 1px solid #f0f0f0; */
}
</style>
