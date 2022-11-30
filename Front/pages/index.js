import Head from 'next/head'
import Image from 'next/image'
import { useEffect, useState } from 'react'
import Notice from './notice'
import SignIn from '../src/component/SignIn'
import styles from '../styles/Home.module.css'

export default function HomePage() {
  return (
    <div>
      <Notice />
    </div>
  )
}

