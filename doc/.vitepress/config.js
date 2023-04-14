const nav = [
  {
    text: '手册',
    link: '/manual/',
    activeMatch: '^/manual/'
  },
  {
    text: '核心模块',
    link: '/core/',
    activeMatch: '^/core/'
  },
]


const sidebar = {
  '/manual/': [
    {
      text: '开始',
      collapsed: false,
      items: [
        { text: '介绍', link: '/manual/introduction' },
        { text: '指南', link: '/manual/guide' },
        { text: '概览', link: '/manual/overview' },
        { text: '安装', link: '/manual/install' },
      ]
    },
  ],
  '/core/': [
    {
      text: '核心模块',
      collapsed: false,
      items: [
        { text: '用户管理', link: '/core/user' },
        { text: '系统管理', link: '/core/system' },
      ]
    },
  ],
}

export default {
  // site-level options
  title: 'Doc',
  description: 'Just playing around.',
  lang: 'zh-CN',
  srcDir: './src',
  scrollOffset: 'header',
  themeConfig: {
    // theme-level options
    nav,
    sidebar,
    docsDir: 'src',
    outDir: 'dist',
  }
}
