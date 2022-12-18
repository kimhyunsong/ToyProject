import Head from 'next/head'
import Image from 'next/image'
import Link from 'next/link';
import { useRouter } from 'next/router';
import styles from '../styles/Home.module.css'
export default function HomePage() {
  
  const router = useRouter();

  function movePage() {
    router.push(`/post`);    
  }
  function moveSignin() {
    router.push(`/sign_in`);    
  }
  return (
    <div>
      <div>Login page</div>
      <input type="text" /><br />
      <input type="text" /><br />
      <button type="button" onClick={movePage}>Login</button>
      <button type="button" onClick={moveSignin}>Sign in</button>
  </div>
  )
  }

