<template>
  <div class="layout-demo">
  <a-layout style="height: 100%;">
    <a-layout-header>
      <a-menu
        :openKeys="['1']"
        :selectedKeys="['0_2']"
        mode='horizontal'
      >
        <a-menu-item key="0_1" disabled>
          <IconHome />
          Menu 1
        </a-menu-item>
        <a-menu-item key="0_2">
          <IconCalendar />
          Menu 2
        </a-menu-item>
        <a-sub-menu key="1">
          <template #title>
            <span><IconCalendar />Navigation 1</span>
          </template>
          <a-menu-item key="1_1">Menu 1</a-menu-item>
          <a-menu-item key="1_2">Menu 2</a-menu-item>
          <a-sub-menu key="2" title="Navigation 2">
            <a-menu-item key="2_1">Menu 1</a-menu-item>
            <a-menu-item key="2_2">Menu 2</a-menu-item>
          </a-sub-menu>
          <a-sub-menu key="3" title="Navigation 3">
            <a-menu-item key="3_1">Menu 1</a-menu-item>
            <a-menu-item key="3_2">Menu 2</a-menu-item>
            <a-menu-item key="3_3">Menu 3</a-menu-item>
          </a-sub-menu>
        </a-sub-menu>
        <a-sub-menu key="4">
          <template #title>
            <span><IconCalendar />Navigation 4</span>
          </template>
          <a-menu-item key="4_1">Menu 1</a-menu-item>
          <a-menu-item key="4_2">Menu 2</a-menu-item>
          <a-menu-item key="4_3">Menu 3</a-menu-item>
        </a-sub-menu>
      </a-menu>
      <a-space size="large">
        <a-avatar>A</a-avatar>
        <a-avatar :style="{ backgroundColor: '#3370ff' }">
          <IconUser />
        </a-avatar>
        <a-avatar :style="{ backgroundColor: '#14a9f8' }">Arco</a-avatar>
        <a-avatar :style="{ backgroundColor: '#00d0b6' }">Design</a-avatar>
        <a-avatar>
          <img
            alt="avatar"
            src="https://p1-arco.byteimg.com/tos-cn-i-uwbnlip3yd/3ee5f13fb09879ecb5185e440cef6eb9.png~tplv-uwbnlip3yd-webp.webp"
          />
        </a-avatar>
      </a-space>
    </a-layout-header>
    <a-layout>
      <a-layout-sider theme="dark">
        <a-tree blockNode :data="treeData" />
      </a-layout-sider>
      <a-layout-content>
        <a-input :style="{width:'320px'}" default-value="Disabled" placeholder="Disabled status" disabled/>

        <a-table size="large" :stripe="true" :bordered="{wrapper: true, cell: true}" :row-selection="{type: 'checkbox', onlyCurrent: false, showCheckedAll: true}" :columns="columns" :data="data" @change="handleChange" :draggable="{ type: 'handle', width: 40 }" >
          <template #name="{ rowIndex }">
            <a-input v-model="data[rowIndex].name" />
          </template>
        </a-table>

        <a-pagination :total="20050" size="mini"/>

      </a-layout-content>
    </a-layout>
    <a-layout-footer>Footer</a-layout-footer>
  </a-layout>
  </div>
</template>
<script setup>
import { RouterLink, RouterView } from 'vue-router'
import {reactive, ref} from "vue";

const treeData = [
  {
    title: 'Trunk 0-0',
    key: '0-0',
    children: [
      {
        title: 'Branch 0-0-0',
        key: '0-0-0',
        children: [
          {
            title: 'Leaf',
            key: '0-0-0-0',
          },
          {
            title: 'Leaf',
            key: '0-0-0-1',
          }
        ]
      },
      {
        title: 'Branch 0-0-1',
        key: '0-0-1',
        children: [
          {
            title: 'Leaf',
            key: '0-0-1-0',
          },
        ]
      },
    ],
  },
];
const columns = reactive([
  {
    title: 'Name',
    dataIndex: 'name',
    slotName: 'name'
  },
  {
    title: 'Salary',
    dataIndex: 'salary',
  },
  {
    title: 'Address',
    dataIndex: 'address',
  },
  {
    title: 'Email',
    dataIndex: 'email',
  },
]);
const data = ref([{
  key: '1',
  name: 'Jane Doe',
  salary: 23000,
  address: '32 Park Road, London',
  email: 'jane.doe@example.com'
}, {
  key: '2',
  name: 'Alisa Ross',
  salary: 25000,
  address: '35 Park Road, London',
  email: 'alisa.ross@example.com'
}, {
  key: '3',
  name: 'Kevin Sandra',
  salary: 22000,
  address: '31 Park Road, London',
  email: 'kevin.sandra@example.com'
}, {
  key: '4',
  name: 'Ed Hellen',
  salary: 17000,
  address: '42 Park Road, London',
  email: 'ed.hellen@example.com'
}, {
  key: '5',
  name: 'William Smith',
  salary: 27000,
  address: '62 Park Road, London',
  email: 'william.smith@example.com'
}]);
const handleChange = (_data) => {
  console.log(_data);
  data.value = _data
}
</script>
<style scoped>
.layout-demo {
  height: 100%;
  width: 100%;
}
.layout-demo :deep(.arco-layout-header),
.layout-demo :deep(.arco-layout-footer),
.layout-demo :deep(.arco-layout-sider-children),
.layout-demo :deep(.arco-layout-content) {
  display: flex;
  flex-direction: column;
  justify-content: center;
  color: var(--color-white);
  font-size: 16px;
  font-stretch: condensed;
  text-align: left;
}


.layout-demo :deep(.arco-layout-header),
.layout-demo :deep(.arco-layout-footer) {
  height: 64px;
  flex-direction: row;
  background-color: var(--color-primary-light-4);
}
.layout-demo :deep(.arco-layout-footer) {
  height: 32px;
  background-color: var(--color-primary-light-4);
}

.layout-demo :deep(.arco-layout-sider) {
  width: 208px;
  background-color: var(--color-primary-light-3);
}

.layout-demo :deep(.arco-layout-content) {
  /*background-color: rgb(var(--arcoblue-6));*/
}
</style>
